package defpackage;

import java.util.Random;

/* compiled from: PG */
/* renamed from: khy  reason: default package */
/* loaded from: classes.dex */
public final class khy {
    static final khz a = new khw(oor.d, true);
    private final Random b;
    private final khl c;

    public khy(Random random, khl khlVar) {
        this.b = random;
        this.c = khlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final khz a(oor oorVar) {
        int f = ofb.f(oorVar.c);
        boolean z = true;
        if (f == 0) {
            f = 1;
        }
        int i = f - 1;
        if (i == 1) {
            if (oorVar.b != 1000) {
                z = false;
            }
            return new khw(oorVar, z);
        } else if (i == 3) {
            if (this.b.nextDouble() * 1000.0d >= oorVar.b) {
                z = false;
            }
            return new khw(oorVar, z);
        } else if (i == 4) {
            return new khx(oorVar, this.b, this.c);
        } else {
            if (i == 5) {
                oorVar = oor.d;
            }
            return new khw(oorVar, true);
        }
    }
}
