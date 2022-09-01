package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jas  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jas implements jat {
    private final /* synthetic */ int c;
    public static final /* synthetic */ jas b = new jas(1);
    public static final /* synthetic */ jas a = new jas(0);

    private /* synthetic */ jas(int i) {
        this.c = i;
    }

    @Override // defpackage.jat
    public final jav a(Object obj) {
        if (this.c != 0) {
            jav javVar = (jav) obj;
            Parcelable.Creator creator = jav.CREATOR;
            return javVar;
        }
        jav javVar2 = (jav) obj;
        Parcelable.Creator creator2 = jav.CREATOR;
        return javVar2;
    }
}
