package defpackage;

/* compiled from: PG */
/* renamed from: iov  reason: default package */
/* loaded from: classes.dex */
public final class iov {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/protoutils/ProtoUtils");

    /* JADX WARN: Type inference failed for: r9v3, types: [ngz, java.lang.Object] */
    public final ngz a(nhf nhfVar, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return nhfVar.h(bArr, nfb.b());
        } catch (IllegalStateException | ngd e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/protoutils/ProtoUtils", "fromByteArray", (char) 30, "ProtoUtils.java")).t("Failed to deserialize proto");
            return null;
        }
    }

    public final byte[] b(ngz ngzVar) {
        if (ngzVar == null) {
            return null;
        }
        try {
            return ngzVar.q();
        } catch (IllegalStateException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/protoutils/ProtoUtils", "toByteArray", '0', "ProtoUtils.java")).t("Failed to serialize proto");
            return null;
        }
    }
}
