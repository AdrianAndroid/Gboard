package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: flc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class flc implements fpz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ flc(fkm fkmVar, int i) {
        this.b = i;
        this.a = fkmVar;
    }

    public /* synthetic */ flc(fkq fkqVar, int i) {
        this.b = i;
        this.a = fkqVar;
    }

    public /* synthetic */ flc(flh flhVar, int i) {
        this.b = i;
        this.a = flhVar;
    }

    public /* synthetic */ flc(fme fmeVar, int i) {
        this.b = i;
        this.a = fmeVar;
    }

    public /* synthetic */ flc(fnz fnzVar, int i) {
        this.b = i;
        this.a = fnzVar;
    }

    public /* synthetic */ flc(fru fruVar, int i) {
        this.b = i;
        this.a = fruVar;
    }

    public /* synthetic */ flc(fvu fvuVar, int i) {
        this.b = i;
        this.a = fvuVar;
    }

    public /* synthetic */ flc(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.fpz
    public final void a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                flb flbVar = (flb) ((fkz) obj).w();
                fle fleVar = new fle((fxa) obj2, null);
                Parcel a = flbVar.a();
                bkh.f(a, fleVar);
                bkh.d(a, r0);
                flbVar.hI(2, a);
                return;
            case 1:
                ?? r02 = this.a;
                fkk fkkVar = new fkk((fxa) obj2, null);
                fko fkoVar = (fko) ((fkn) obj).w();
                Parcel a2 = fkoVar.a();
                bkh.d(a2, r02);
                bkh.f(a2, fkkVar);
                fkoVar.hI(1, a2);
                return;
            case 2:
                ?? r03 = this.a;
                flb flbVar2 = (flb) ((fkz) obj).w();
                fla flaVar = new fla((fxa) obj2, 1, null, null);
                Parcel a3 = flbVar2.a();
                bkh.f(a3, flaVar);
                bkh.d(a3, r03);
                flbVar2.hI(5, a3);
                return;
            case 3:
                ?? r04 = this.a;
                fmf fmfVar = new fmf((fxa) obj2, null);
                fml fmlVar = (fml) ((fmj) obj).w();
                Parcel a4 = fmlVar.a();
                bkh.f(a4, fmfVar);
                bkh.d(a4, r04);
                fmlVar.hJ(8, a4);
                return;
            case 4:
                ?? r05 = this.a;
                frz frzVar = (frz) ((fsc) obj).w();
                Parcel a5 = frzVar.a();
                bkh.d(a5, r05);
                frzVar.hJ(1, a5);
                ((fxa) obj2).d(null);
                return;
            case 5:
                ?? r06 = this.a;
                fvz fvzVar = (fvz) ((fwa) obj).w();
                fvw fvwVar = new fvw((fxa) obj2, null);
                Parcel a6 = fvzVar.a();
                a6.writeString(null);
                bkh.d(a6, r06);
                bkh.f(a6, fvwVar);
                fvzVar.hI(3, a6);
                return;
            case 6:
                Object obj3 = this.a;
                ((gdi) ((gdj) obj).w()).e(new gdo((fxa) obj2, 1, null, null), (String) obj3);
                return;
            default:
                fnz fnzVar = (fnz) this.a;
                ((gfn) obj).H(((gfe) fnzVar.d).b, null, new gfb(fnzVar, (fxa) obj2, null));
                return;
        }
    }
}
