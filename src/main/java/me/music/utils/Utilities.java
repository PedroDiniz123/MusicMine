package me.music.utils;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Player;

public class Utilities {
    public static void checkNote(String notes, Player player, String instrument){

        if (instrument.equalsIgnoreCase("piano")) {

            if (notes.equalsIgnoreCase("F#0") || notes.equalsIgnoreCase("Gb0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(0, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("G0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("G#0") || notes.equalsIgnoreCase("Ab0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(0, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("A0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("A#0") || notes.equalsIgnoreCase("Bb0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(0, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("B0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.B));
            }

            if (notes.equalsIgnoreCase("C1") || notes.equalsIgnoreCase("B#0")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C#1") || notes.equalsIgnoreCase("Db")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(0, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("D1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("D#1") || notes.equalsIgnoreCase("Eb1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(0, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("E1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.E));
            }

            if (notes.equalsIgnoreCase("F1") || notes.equalsIgnoreCase("E#1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("F#1") || notes.equalsIgnoreCase("Gb1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(1, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("G1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("G#1") || notes.equalsIgnoreCase("Ab1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(1, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("A1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("A#1") || notes.equalsIgnoreCase("Bb1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(1, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("B1")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.B));
            }

            if (notes.equalsIgnoreCase("B#2") || notes.equalsIgnoreCase("C2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C2") || notes.equalsIgnoreCase("B#2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C#2") || notes.equalsIgnoreCase("Db2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("D2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("D#2") || notes.equalsIgnoreCase("Eb2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(1, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("E2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.E));
            }

            if (notes.equalsIgnoreCase("F2") || notes.equalsIgnoreCase("E#2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("F#2") || notes.equalsIgnoreCase("Gb2")) {
                player.playNote(player.getLocation(), Instrument.PIANO, Note.sharp(2, Note.Tone.F));
            }
        }
        if (instrument.equalsIgnoreCase("bass")) {
            if (notes.equalsIgnoreCase("F#0") || notes.equalsIgnoreCase("Gb0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("G0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("G#0") || notes.equalsIgnoreCase("Ab0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("A0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("A#0") || notes.equalsIgnoreCase("Bb0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("B0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.B));
            }

            if (notes.equalsIgnoreCase("C1") || notes.equalsIgnoreCase("B#0")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C#1") || notes.equalsIgnoreCase("Db")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("D1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("D#1") || notes.equalsIgnoreCase("Eb1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("E1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.E));
            }

            if (notes.equalsIgnoreCase("F1") || notes.equalsIgnoreCase("E#1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("F#1") || notes.equalsIgnoreCase("Gb1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("G1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("G#1") || notes.equalsIgnoreCase("Ab1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Note.Tone.G));
            }

            if (notes.equalsIgnoreCase("A1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("A#1") || notes.equalsIgnoreCase("Bb1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Note.Tone.A));
            }

            if (notes.equalsIgnoreCase("B1")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.B));
            }

            if (notes.equalsIgnoreCase("B#2") || notes.equalsIgnoreCase("C2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C2") || notes.equalsIgnoreCase("B#2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("C#2") || notes.equalsIgnoreCase("Db2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Note.Tone.C));
            }

            if (notes.equalsIgnoreCase("D2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("D#2") || notes.equalsIgnoreCase("Eb2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Note.Tone.D));
            }

            if (notes.equalsIgnoreCase("E2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.E));
            }

            if (notes.equalsIgnoreCase("F2") || notes.equalsIgnoreCase("E#2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.F));
            }

            if (notes.equalsIgnoreCase("F#2") || notes.equalsIgnoreCase("Gb2")) {
                player.playNote(player.getLocation(), Instrument.BASS_GUITAR, Note.sharp(2, Note.Tone.F));
            }
        }

    }
}
