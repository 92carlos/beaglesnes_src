DESCRIPTION = "BEAGLESNES APPLICATION" 
SECTION = "games" 
LICENSE = "snes.embebidos" 
SRC_URI = "http://sourceforge.net/projects/beaglesnessrc/files/beaglesnes_src.v0.6.tar.gz" 

DEPENDS = "expat libsdl libsdl-image libsdl-mixer libsdl-ttf"

S = "${WORKDIR}/beaglesnes_src.v0.6/sdl"

SRC_URI[md5sum] = "6b08d34597f578717e39c4e935e83a48"
SRC_URI[sha256sum] = "f00a138ce2c5a6078b83f4ad315063912d676d49925e8633a659b5305d0d4ecd"

inherit autotools

