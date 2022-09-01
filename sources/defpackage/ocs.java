package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ocs  reason: default package */
/* loaded from: classes2.dex */
final class ocs implements ofi {
    private InputStream a;

    public ocs(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.ofi
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
