package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: nev  reason: default package */
/* loaded from: classes2.dex */
public final class nev extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    nev() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public nev(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public nev(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
