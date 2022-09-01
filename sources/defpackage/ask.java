package defpackage;

/* compiled from: PG */
/* renamed from: ask  reason: default package */
/* loaded from: classes.dex */
public final class ask {
    public float a;
    public float b;

    public ask() {
        this(1.0f, 1.0f);
    }

    public ask(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        return f + "x" + f2;
    }
}
