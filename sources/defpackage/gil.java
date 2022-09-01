package defpackage;

import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gil  reason: default package */
/* loaded from: classes.dex */
public final class gil {
    public byte[] a;
    public int b;
    public final Object c;
    public final Object d;

    public gil(EkhoWriter ekhoWriter, nni nniVar) {
        this.c = ekhoWriter;
        this.d = nniVar;
        this.b = 1;
    }

    public gil(String str, ndy ndyVar) {
        this.d = str;
        this.c = ndyVar;
        this.b = 0;
        this.a = null;
    }

    public final void a(ngz ngzVar) {
        this.a = ngzVar.q();
    }

    public final synchronized fwf b() {
        return new fwf((String) this.d, ((ndu) this.c).q(), this.b, this.a);
    }

    public final synchronized void c(byte[] bArr) {
        this.b++;
        this.a = Arrays.copyOf(bArr, bArr.length);
    }
}
