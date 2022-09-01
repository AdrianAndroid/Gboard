package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nfc  reason: default package */
/* loaded from: classes2.dex */
public final class nfc {
    public static final ndb a = new ndb();
    private static final ndb b;

    static {
        ndb ndbVar;
        try {
            ndbVar = (ndb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ndbVar = null;
        }
        b = ndbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ndb a() {
        ndb ndbVar = b;
        if (ndbVar != null) {
            return ndbVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
