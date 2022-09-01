package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: ibj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ibj implements jbd {
    private final /* synthetic */ int c;
    public static final /* synthetic */ ibj b = new ibj(1);
    public static final /* synthetic */ ibj a = new ibj(0);

    private /* synthetic */ ibj(int i) {
        this.c = i;
    }

    @Override // defpackage.jbd
    public final void a(Parcel parcel, Object obj, int i) {
        if (this.c == 0) {
            ((iay) obj).writeToParcel(parcel, i);
        } else {
            ((iay) obj).writeToParcel(parcel, i);
        }
    }
}
