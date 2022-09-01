package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: nsx  reason: default package */
/* loaded from: classes2.dex */
public final class nsx {
    public final boolean a;
    public final Object b;

    public nsx(EditorInfo editorInfo, boolean z) {
        this.b = editorInfo;
        this.a = z;
    }

    public nsx(cd cdVar, byte[] bArr, byte[] bArr2) {
        this.b = cdVar;
        this.a = false;
    }

    public nsx(Object obj) {
        this.b = obj;
        this.a = false;
    }

    public nsx(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    public nsx(nsw nswVar, boolean z) {
        jdg.Q(nswVar, "decompressor");
        this.b = nswVar;
        this.a = z;
    }

    public nsx(boolean z, llp llpVar) {
        this.a = z;
        this.b = llpVar;
    }

    public final mko a(Callable callable, Executor executor) {
        return new mjk((llg) this.b, this.a, executor, callable);
    }

    public final mko b(mix mixVar, Executor executor) {
        return new mjk((llg) this.b, this.a, executor, mixVar);
    }
}
