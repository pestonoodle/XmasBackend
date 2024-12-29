package com.generation.xmasbackend.controllers;

import com.generation.xmasbackend.model.entities.Consegna;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.*;

public class ConsegneController {

	public double calcoloDistanze() {
		Graph<String, DefaultWeightedEdge> paesiGrafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);

		String seattle = "Seattle";
		String washington = "Washington";
		String mosca = "Mosca";
		String roma = "Roma";

		paesiGrafo.setEdgeWeight(paesiGrafo.addEdge(seattle, washington), 4438.5);
		paesiGrafo.setEdgeWeight(paesiGrafo.addEdge(seattle, mosca), 8365.0);
		paesiGrafo.setEdgeWeight(paesiGrafo.addEdge(seattle, roma), 9110.0);

		Map<String, Double> distances = new HashMap<>();
		Map<String, String> previous = new HashMap<>();
		PriorityQueue<Map.Entry<String, Double>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());

		for (String vertex : paesiGrafo.vertexSet()) {
			distances.put(vertex, Double.POSITIVE_INFINITY);
		}
		distances.put(seattle, 0.0);

		queue.add(Map.entry(seattle, 0.0));

		while (!queue.isEmpty()) {
			String current = queue.poll().getKey();

			for (DefaultWeightedEdge edge : paesiGrafo.edgesOf(current)) {
				String neighbor = Graphs.getOppositeVertex(paesiGrafo, edge, current);
				double newDistance = distances.get(current) + paesiGrafo.getEdgeWeight(edge);

				if (newDistance < distances.get(neighbor)) {
					distances.put(neighbor, newDistance);
					previous.put(neighbor, current);
					queue.add(Map.entry(neighbor, newDistance));
				}
			}
		}

		//crescente
		List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(distances.entrySet());
		sortedEntries.removeIf(entry -> entry.getKey().equals(seattle));
		sortedEntries.sort(Map.Entry.comparingByValue());

		double distanzaTot = 0;

		for (Map.Entry<String, Double> entry : sortedEntries) {
			double distance = entry.getValue();
			distanzaTot += distance * 2;
		}

		System.out.println("Distanza totale:" + distanzaTot + " km");

		return distanzaTot;
	}

	public double calcoloTempo(Consegna c)
	{
		double tempoRifornimento = c.getTotConsegne().size() * 3;

		double distanza = calcoloDistanze();

		return distanza / c.getVelocitaSlitta();
	}

}
