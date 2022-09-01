package defpackage;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;

/* compiled from: PG */
/* renamed from: joo  reason: default package */
/* loaded from: classes.dex */
public final class joo implements NativeLogManager {
    public final fwo a;
    public final String b;
    public final mfx c;
    private final mlu d;

    public joo(fwo fwoVar, String str, mfx mfxVar, mlu mluVar) {
        this.a = fwoVar;
        this.b = str;
        this.c = mfxVar;
        this.d = mluVar;
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logDebugDiag(int i) {
        this.d.b(new dob(this, i, 12));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logProdDiag(int i) {
        this.d.b(new dob(this, i, 11));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logToLongHistogram(int i, int i2, int i3, int i4, long j) {
        this.d.b(new jon(this, i, i4, i2, i3, null, j));
    }

    @Override // com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager
    public final void logToLongHistogram(int i, int i2, int i3, int i4, String str, long j) {
        this.d.b(new jon(this, i, i4, i2, i3, str, j));
    }
}
