package defpackage;

/* compiled from: PG */
/* renamed from: atx  reason: default package */
/* loaded from: classes.dex */
public final class atx implements Cloneable {
    public bfq a = bfn.b;

    public static atx b() {
        atx atxVar = new atx();
        bfk bfkVar = new bfk();
        ce.m(bfkVar);
        atxVar.a = bfkVar;
        return atxVar;
    }

    /* renamed from: a */
    public final atx clone() {
        try {
            return (atx) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
