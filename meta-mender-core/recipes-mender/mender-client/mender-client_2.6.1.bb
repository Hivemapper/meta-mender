require mender-client.inc

################################################################################
#-------------------------------------------------------------------------------
# THINGS TO CONSIDER FOR EACH RELEASE:
# - SRC_URI (particularly "branch")
# - SRCREV
# - DEFAULT_PREFERENCE
#-------------------------------------------------------------------------------

SRC_URI = "git://github.com/Hivemapper/mender;protocol=https;branch=2.6.x-mender-fix"

# Tag: 2.6.1
SRCREV = "f9a2924191f7e5c11c007d0110e3bfac9bafebc6"

# Enable this in Betas, and in branches that cannot carry this major version as
# default.
# Downprioritize this recipe in version selections.
#DEFAULT_PREFERENCE = "-1"

################################################################################

# DO NOT change the checksum here without make sure that ALL licenses (including
# dependencies) are included in the LICENSE variable below. Note that for
# releases, we must check the LIC_FILES_CHKSUM.sha256 file, not the LICENSE
# file.
# LIC_FILES_CHKSUM = "file://src/github.com/mendersoftware/mender/LIC_FILES_CHKSUM.sha256;md5=69a48b331ae876b6775139310ec72f1b"

# not actually closed, I just can't build without this
LICENSE = "CLOSED" 

DEPENDS += "xz openssl"
RDEPENDS_${PN} += "liblzma openssl"

RDEPENDS_${PN} += "mender-artifact-info"
