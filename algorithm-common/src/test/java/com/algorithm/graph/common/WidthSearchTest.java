package com.algorithm.graph.common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class WidthSearchTest {

    @Test
    public void bfs() {
        Node A = new Node(1);
        Node B = new Node(3);
        Node C = new Node(4);
        Node D = new Node(7);
        Node E = new Node(2);

        ArrayList<Node> A_Nexts = new ArrayList<>();
        A_Nexts.add(C);
        A_Nexts.add(B);
        A_Nexts.add(E);
        A.nexts = A_Nexts;

        ArrayList<Edge> A_edges = new ArrayList<>();
        A_edges.add(new Edge(0,A,C));
        A_edges.add(new Edge(0,A,B));
        A_edges.add(new Edge(0,A,E));
        A.edges = A_edges;

        ArrayList<Node> B_Nexts = new ArrayList<>();
        B_Nexts.add(A);
        B_Nexts.add(C);
        B_Nexts.add(D);
        B_Nexts.add(E);
        B.nexts = B_Nexts;

        ArrayList<Edge> B_edges = new ArrayList<>();
        B_edges.add(new Edge(0,B,A));
        B_edges.add(new Edge(0,B,C));
        B_edges.add(new Edge(0,B,D));
        B_edges.add(new Edge(0,B,E));
        B.edges = B_edges;

        ArrayList<Node> C_Nexts = new ArrayList<>();
        C_Nexts.add(A);
        C_Nexts.add(B);
        C_Nexts.add(D);
        C.nexts = C_Nexts;

        ArrayList<Edge> C_edges = new ArrayList<>();
        C_edges.add(new Edge(0,C,A));
        C_edges.add(new Edge(0,C,B));
        C_edges.add(new Edge(0,C,D));
        C.edges = C_edges;


        ArrayList<Node> D_Nexts = new ArrayList<>();
        D_Nexts.add(C);
        D_Nexts.add(B);
        D_Nexts.add(E);
        D.nexts = D_Nexts;

        ArrayList<Edge> D_edges = new ArrayList<>();
        D_edges.add(new Edge(0,D,C));
        D_edges.add(new Edge(0,D,B));
        D_edges.add(new Edge(0,D,E));
        D.edges = D_edges;



        ArrayList<Node> E_Nexts = new ArrayList<>();
        E_Nexts.add(A);
        E_Nexts.add(B);
        E_Nexts.add(D);
        E.nexts = E_Nexts;

        ArrayList<Edge> E_edges = new ArrayList<>();
        E_edges.add(new Edge(0,E,A));
        E_edges.add(new Edge(0,E,B));
        E_edges.add(new Edge(0,E,D));
        E.edges = E_edges;

        WidthSearch.bfs(A);


    }



    @Test
    public void dfs() {
        Node A = new Node(1);
        Node B = new Node(3);
        Node C = new Node(4);
        Node D = new Node(7);
        Node E = new Node(2);

        ArrayList<Node> A_Nexts = new ArrayList<>();
        A_Nexts.add(C);
        A_Nexts.add(B);
        A_Nexts.add(E);
        A.nexts = A_Nexts;

        ArrayList<Edge> A_edges = new ArrayList<>();
        A_edges.add(new Edge(0,A,C));
        A_edges.add(new Edge(0,A,B));
        A_edges.add(new Edge(0,A,E));
        A.edges = A_edges;

        ArrayList<Node> B_Nexts = new ArrayList<>();
        B_Nexts.add(A);
        B_Nexts.add(C);
        B_Nexts.add(D);
        B_Nexts.add(E);
        B.nexts = B_Nexts;

        ArrayList<Edge> B_edges = new ArrayList<>();
        B_edges.add(new Edge(0,B,A));
        B_edges.add(new Edge(0,B,C));
        B_edges.add(new Edge(0,B,D));
        B_edges.add(new Edge(0,B,E));
        B.edges = B_edges;

        ArrayList<Node> C_Nexts = new ArrayList<>();
        C_Nexts.add(A);
        C_Nexts.add(B);
        C_Nexts.add(D);
        C.nexts = C_Nexts;

        ArrayList<Edge> C_edges = new ArrayList<>();
        C_edges.add(new Edge(0,C,A));
        C_edges.add(new Edge(0,C,B));
        C_edges.add(new Edge(0,C,D));
        C.edges = C_edges;


        ArrayList<Node> D_Nexts = new ArrayList<>();
        D_Nexts.add(C);
        D_Nexts.add(B);
        D_Nexts.add(E);
        D.nexts = D_Nexts;

        ArrayList<Edge> D_edges = new ArrayList<>();
        D_edges.add(new Edge(0,D,C));
        D_edges.add(new Edge(0,D,B));
        D_edges.add(new Edge(0,D,E));
        D.edges = D_edges;



        ArrayList<Node> E_Nexts = new ArrayList<>();
        E_Nexts.add(A);
        E_Nexts.add(B);
        E_Nexts.add(D);
        E.nexts = E_Nexts;

        ArrayList<Edge> E_edges = new ArrayList<>();
        E_edges.add(new Edge(0,E,A));
        E_edges.add(new Edge(0,E,B));
        E_edges.add(new Edge(0,E,D));
        E.edges = E_edges;

        WidthSearch.dfs(A);


    }
}