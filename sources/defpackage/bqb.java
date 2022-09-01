package defpackage;

import com.google.android.apps.inputmethod.latin.keyboard.MorseKeyboard;

/* compiled from: PG */
/* renamed from: bqb  reason: default package */
/* loaded from: classes.dex */
public final class bqb implements Runnable {
    public hfd a;
    public boolean b;
    public final /* synthetic */ MorseKeyboard c;
    private int d;

    public bqb(MorseKeyboard morseKeyboard) {
        this.c = morseKeyboard;
    }

    public final void a() {
        if (this.b) {
            this.c.a.removeCallbacks(this);
            this.b = false;
            this.d = 0;
        }
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hsz hszVar = this.c.v;
        hfd c = hfd.c(this.a);
        int i = this.d + 1;
        this.d = i;
        c.j = i;
        c.k();
        c.k = this.c;
        hszVar.z(c);
        MorseKeyboard morseKeyboard = this.c;
        morseKeyboard.a.postDelayed(this, morseKeyboard.i);
    }
}
