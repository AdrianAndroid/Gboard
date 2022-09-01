package defpackage;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeFiles;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jom  reason: default package */
/* loaded from: classes.dex */
public final class jom implements NativeFiles, Closeable {
    public final jno a;
    public final List b = new ArrayList();
    private final mlu c;

    public jom(jno jnoVar, mlu mluVar) {
        this.a = jnoVar;
        this.c = mluVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.b(new joq(this, 1));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeFiles
    public final StatusOr createTempFile(String str, String str2) {
        return (StatusOr) this.c.a(new jos(this, str, str2, 1));
    }
}
