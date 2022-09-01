package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ngv  reason: default package */
/* loaded from: classes2.dex */
public final class ngv {
    public static final ndb a;
    public static final ndb b;

    static {
        ndb ndbVar;
        try {
            ndbVar = (ndb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ndbVar = null;
        }
        a = ndbVar;
        b = new ndb();
    }
}
