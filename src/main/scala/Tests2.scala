object Tests2 extends App {
  val frankenstein = Book("978-0486282114")
  println(frankenstein)
  val msg2 = Message("joe@cat.es", "gui@bec.ca", "msg")
  val msg3 = Message("joe@cat.es", "gui@bec.ca", "msg")
  println(msg2 == msg3)
}

//Page 22