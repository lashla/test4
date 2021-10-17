fun main() {
    val fullStr: String =
        "NAME=\"English\", TYPE=AUDIO, GROUP-ID=\"audio-stereo-64\", LANGUAGE=\"en\", DEFAULT=YES, AUTOSELECT=YES, URI=\"english.m3u8\""
    val newStr: List<String> = fullStr.split(", ")
    for (index in newStr.indices) {
        println("KEY-${newStr[index].replace("=", " value-").replace("\"", "")}")
    }
}
