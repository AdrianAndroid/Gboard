package defpackage;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator;
import com.google.android.libraries.micore.learning.training.util.StatusOr;

/* compiled from: PG */
/* renamed from: jok  reason: default package */
/* loaded from: classes.dex */
public final class jok implements NativeExampleIterator {
    public final jog a;
    final /* synthetic */ jog b;
    public final /* synthetic */ jol c;

    public jok(jol jolVar, jog jogVar) {
        this.c = jolVar;
        this.b = jogVar;
        this.a = jogVar;
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.d.b(new idx(this, this.b, 16));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeExampleIterator
    public final StatusOr next() {
        return (StatusOr) this.c.d.a(new jor(this, 1));
    }
}
