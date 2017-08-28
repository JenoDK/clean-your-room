package com.jeno.jsorter

import java.io.File
import java.util.*

class ScannedFile(val file: File) {

    fun getSeason(): Optional<Int> {
        var fullName = file.name
        return Optional.empty()
    }

}