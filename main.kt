fun main() {
    val fullStr: String =
        "NAME=\"English\", TYPE=AUDIO, GROUP-ID=\"audio-stereo-64\", LANGUAGE=\"en\", DEFAULT=YES, AUTOSELECT=YES, URI=\"english.m3u8\""
    val newStr: List<String> = fullStr.split(", ")
    var key: String
    var value: String
    for (index in newStr.indices) {
       key = newStr[index].substringBefore("=")
        value = newStr[index].substringAfter("=").removeSurrounding("\"")
        println("key-$key value-$value")
    }
}
