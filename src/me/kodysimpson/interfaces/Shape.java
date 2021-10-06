package me.kodysimpson.interfaces;

import me.kodysimpson.interfaces.Circle;
import me.kodysimpson.interfaces.Triangle;

public sealed interface Shape permits Circle, Triangle {
}
