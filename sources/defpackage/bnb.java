package defpackage;

/* compiled from: PG */
/* renamed from: bnb  reason: default package */
/* loaded from: classes.dex */
public class bnb extends Exception {
    public final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public bnb(int i) {
        super("errorCode: " + i + ", engine: 2");
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bnb(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }
}
