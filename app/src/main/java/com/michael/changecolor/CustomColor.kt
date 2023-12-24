package com.michael.changecolor

enum class CustomColor(val rgb: Int) {
    BLACK(-0x1000000),
    DKGRAY(-0xbbbbbc),
    GRAY(-0x777778),
    LTGRAY(-0x333334),
    WHITE(-0x1),
    RED(-0x10000),
    GREEN(-0xff0100),
    BLUE(-0xffff01),
    YELLOW(-0x100),
    CYAN(-0xff0001),
    MAGENTA(-0xff01),
    TRANSPARENT(0);
}