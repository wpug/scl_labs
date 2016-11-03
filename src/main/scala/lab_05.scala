// Rozwiązując poniższe ćwiczenia NIE korzystaj z następujących
// standardowych operacji na listach:
// * length/size
// * map
// * filter
// * ::: (oraz „odmian” typu ++)
// * flatten
// * flatMap
// * reverse (oraz „odmian” tzn. reverseMap, reverse_:::)
// W szczególności nie używaj też konstrukcji for na listach.
//
// Nie używaj też zmiennych (wprowadzanych za pomocą „var”).
//


object C01 extends App {
    import sys.error

    def succ(n: Int) = n + 1
    def pred(n: Int) = n - 1

    // Ćwiczenie 1
    def add(x: Int, y: Int): Int = error("do zrobienia: Załóż, że x i y >= 0. Nie używaj + ani - na Int. Użyj succ/pred zdefiniowanych powyżej.")

    // Ćwiczenie 2
    def sum(x: List[Int]): Int = error("do zrobienia")

    // Ćwiczenie 3
    def length[A](x: List[A]): Int = error("do zrobienia")

    // Ćwiczenie 4
    def map[A, B](x: List[A], f: A => B): List[B] = error("do zrobienia")

    // Ćwiczenie 5
    def filter[A](x: List[A], f: A => Boolean): List[A] = error("do zrobienia")

    // Ćwiczenie 6
    // funkcja "cleanup" powinna usuwać wielokrotne, następujące po sobie
    // wystąpienia tego samego elementu na liście
    // np. cleanup(List(1,1,2,1,3,3)) == List(1,2,1,3)
    def cleanup(x: List[Int]): List[Int] = error("do zrobienia")

    // Ćwiczenie 7
    // funkcja "chop" powinna wycinać „podlistę” zaczynającą się od elementu
    // o numerze "b" i kończącą na elemencie o numerze "e" - przyjmijmy, że
    // pierwszy element listy ma numer 1. Przykład
    // chop(List('a,2,'b,3,'c,4),2,4) == List(2,'b,3)
    def chop[A](x: List[A],b: Int, e: Int): List[A] = error("do zrobienia")

    // Ćwiczenie 8
    // funkcja "remEls" powinna usuwać co "k"-ty element listy. Przykład:
    // remEls(List(1,1,2,1,3,3),3) == List(1,1,1,3)
    def remEls[A](x: List[A],k: Int): List[A] = error("do zrobienia")

    // Ćwiczenie 9
    // funkcja "rot" powinna przesuwać cyklicznie elementy listy o wartość "k".
    // Przykład:
    // rot(List(1,2,3,4,5,6),3) == List(4,5,6,1,2,3)
    def rot[A](x: List[A],k: Int): List[A] = error("do zrobienia")

}
