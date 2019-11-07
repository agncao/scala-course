import scala.collection.immutable.LinearSeq
def sum(seq:LinearSeq[Int]):Int={
  var total:Int = seq.head;
  if(!seq.tail.isEmpty) {
    total +=sum(seq.tail);
  }
  total
}
sum(LinearSeq(22,1,2,432));
