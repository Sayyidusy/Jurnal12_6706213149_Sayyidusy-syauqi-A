package com.company;
public class Main {
    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(9);

        myList.addEdge('A', 'B'); //jika di konfersikan kedalam integer akan mendapatkan nilai 65
        myList.addEdge('A', 'D');
        myList.addEdge('A', 'E');
        myList.addEdge('B', 'E');
        myList.addEdge('C', 'B');
        myList.addEdge('D', 'G');
        myList.addEdge('E', 'F');
        myList.addEdge('E', 'H');
        myList.addEdge('F', 'C');
        myList.addEdge('F', 'H');
        myList.addEdge('H', 'I');
        myList.addEdge('I', 'F');
        myList.printGraph();
    }
}
