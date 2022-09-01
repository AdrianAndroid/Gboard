package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: ibh  reason: default package */
/* loaded from: classes.dex */
final class ibh implements jbd {
    private final ibf a;
    private final ibf b;

    public ibh(kns knsVar, byte[] bArr) {
        this.b = new ibf(knsVar, 2, null);
        this.a = new ibf(knsVar, 0, null);
    }

    @Override // defpackage.jbd
    /* renamed from: b */
    public final void a(Parcel parcel, ibi ibiVar, int i) {
        kki.D(parcel, ibiVar.b, i, this.b);
        kki.D(parcel, ibiVar.c, i, this.a);
    }
}
