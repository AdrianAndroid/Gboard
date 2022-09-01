package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bpx  reason: default package */
/* loaded from: classes.dex */
public final class bpx {
    public static final int a;
    private static final llw p;
    public long c;
    public String e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public lmz l;
    public lmz m;
    public final bpw n;
    public long b = 0;
    public final StringBuilder d = new StringBuilder(a + 1);
    public final Handler j = new Handler();
    public final Runnable k = new bqj(this, 1);
    public boolean o = false;

    static {
        lls i = llw.i(76);
        i.a(".-", "a");
        i.a("-...", "b");
        i.a("-.-.", "c");
        i.a("-..", "d");
        i.a(".", "e");
        i.a("..-.", "f");
        i.a("--.", "g");
        i.a("....", "h");
        i.a("..", "i");
        i.a(".---", "j");
        i.a("-.-", "k");
        i.a(".-..", "l");
        i.a("--", "m");
        i.a("-.", "n");
        i.a("---", "o");
        i.a(".--.", "p");
        i.a("--.-", "q");
        i.a(".-.", "r");
        i.a("...", "s");
        i.a("-", "t");
        i.a("..-", "u");
        i.a("...-", "v");
        i.a(".--", "w");
        i.a("-..-", "x");
        i.a("-.--", "y");
        i.a("--..", "z");
        i.a("-----", "0");
        i.a(".----", "1");
        i.a("..---", "2");
        i.a("...--", "3");
        i.a("....-", "4");
        i.a(".....", "5");
        i.a("-....", "6");
        i.a("--...", "7");
        i.a("---..", "8");
        i.a("----.", "9");
        i.a(".-.-.-", ".");
        i.a("--..--", ",");
        i.a("..--..", "?");
        i.a(".----.", "'");
        i.a("-.-.--", "!");
        i.a("-..-.", "/");
        i.a("-.--.", "(");
        i.a("-.--.-", ")");
        i.a(".-...", "&");
        i.a("---...", ":");
        i.a("-.-.-.", ";");
        i.a("-...-", "=");
        i.a(".-.-.", "+");
        i.a("-....-", "-");
        i.a("..--.-", "_");
        i.a(".--.-.", "@");
        i.a(".-..-.", "\"");
        i.a("...-.", "*");
        i.a("-.-.-", "\\");
        i.a("---.-", "%");
        i.a("--.-.", "#");
        i.a("--.-.-", "|");
        i.a("......", "^");
        i.a(".---..", "~");
        i.a("-..-.-", "`");
        i.a("...-..", "$");
        i.a(".--..", "[");
        i.a(".--..-", "]");
        i.a(".--.-", "{");
        i.a(".--.--", "}");
        i.a("-.---", "<");
        i.a("-.----", ">");
        i.a("..--", "[space]");
        i.a(".-.-", "[enter]");
        i.a("....-.", "[shift]");
        i.a("----", "[backspace]");
        i.a(".-----", "[candidate 1]");
        i.a("..----", "[candidate 2]");
        i.a("...---", "[candidate 3]");
        i.a("---.", "[hint]");
        llw l = i.l();
        p = l;
        int i2 = 0;
        for (String str : l.keySet()) {
            if (str.length() > i2) {
                i2 = str.length();
            }
        }
        a = i2;
    }

    public bpx(bpw bpwVar) {
        this.n = bpwVar;
    }

    public final int a(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return 0;
        }
        int i = f.c;
        int i2 = hfdVar.g;
        long j = 0;
        long j2 = i | (1 != (i2 & 1) ? 0L : 4294967296L) | ((i2 & 4096) == 4096 ? 17592186044416L : 0L);
        if ((i2 & 2) == 2) {
            j = 8589934592L;
        }
        long j3 = j2 | j;
        lmz lmzVar = this.l;
        if (lmzVar != null && lmzVar.contains(Long.valueOf(j3))) {
            return -10109;
        }
        lmz lmzVar2 = this.m;
        if (lmzVar2 != null && lmzVar2.contains(Long.valueOf(j3))) {
            return -10110;
        }
        return i;
    }

    public final String b() {
        String str = (String) p.get(this.d.toString());
        if ((this.b & 1) == 1 && !TextUtils.isEmpty(str) && !str.startsWith("[")) {
            str = str.toUpperCase(Locale.US);
        }
        if (!"[hint]".equals(str) || this.o) {
            return str;
        }
        return null;
    }

    public final void c() {
        this.d.setLength(0);
        this.e = null;
        e();
    }

    public final void d(int i) {
        this.j.removeCallbacks(this.k);
        if (i > 0) {
            this.j.postDelayed(this.k, i);
        }
    }

    public final void e() {
        if (this.c != 0 || TextUtils.isEmpty(this.e) || "[enter]".equals(this.e)) {
            if (this.c == 0) {
                return;
            }
            if (!TextUtils.isEmpty(this.e) && !"[enter]".equals(this.e)) {
                return;
            }
            this.n.fp(iby.n, false);
            this.n.fp(this.c, true);
            this.c = 0L;
            return;
        }
        this.c = this.b & iby.n;
        this.n.fp(iby.n, false);
        this.n.fp(iby.g, true);
    }

    public final void f() {
        this.n.j(-10098, new String[]{lfd.d(this.e), this.d.toString()});
    }
}
