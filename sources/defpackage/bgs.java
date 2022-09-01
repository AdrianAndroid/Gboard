package defpackage;

/* compiled from: PG */
/* renamed from: bgs  reason: default package */
/* loaded from: classes.dex */
public final class bgs {
    public final bgu a;
    public final bid b;

    public bgs(bgu bguVar, bid bidVar) {
        this.a = bguVar;
        this.b = bidVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        bgu bguVar = this.a;
        sb.append(bguVar);
        return String.valueOf(bguVar).concat(" {}");
    }
}
