package Novella

import com.xenomachina.argparser.ArgParser
import java.io.PrintStream
import java.io.ByteArrayOutputStream







fun main1 (args: Array<String>){
    ArgParser(args).parseInto(::ResOfNovel).writting()
    val baos = ByteArrayOutputStream()
    val ps = PrintStream(baos)
    val old = System.out
    System.setOut(ps)
    println("Правильных ответов =2")
    System.out.flush()
    System.setOut(old)
    println(baos.toString())
}


