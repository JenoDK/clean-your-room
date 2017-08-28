package com.jeno.jsorter

import java.io.File

fun main(args: Array<String>) {
    scanFolder(File("/Users/jeno/IdeaProjects/jsorter2/src/main/resources/test_folder/"))
}

fun scanFolder(folder: File): File {
    folder.walkTopDown()
            .filter { it.isFile }
            .map { ScannedFile(it) }
            .toList();
    return folder
}

