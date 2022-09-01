package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: azy  reason: default package */
/* loaded from: classes.dex */
public final class azy implements azo, azz {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public azy(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.azz
    public final avj a(Uri uri) {
        int i = this.b;
        return i != 0 ? i != 1 ? new avz(this.a, uri) : new avf(this.a, uri) : new avr(this.a, uri);
    }

    @Override // defpackage.azo
    public final void c() {
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? new baa(this) : new baa(this);
        }
        return new baa(this);
    }
}
