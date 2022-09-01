package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzt  reason: default package */
/* loaded from: classes.dex */
public final class fzt extends bkg implements fzu {
    final /* synthetic */ fwj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzt(fwj fwjVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
        this.a = fwjVar;
    }

    @Override // defpackage.fzu
    public final void e(String str, ftm ftmVar, ftm ftmVar2, fzr fzrVar) {
        this.a.a(str, (byte[]) ftl.c(ftmVar), (byte[]) ftl.c(ftmVar2), new fzi(fzrVar), mzg.b);
    }

    @Override // defpackage.fzu
    public final void f(String str, ftm ftmVar, ftm ftmVar2, fzr fzrVar, ftm ftmVar3) {
        mzg mzgVar = mzg.b;
        byte[] bArr = (byte[]) ftl.c(ftmVar3);
        if (bArr != null) {
            try {
                mzgVar = (mzg) nfm.z(mzg.b, bArr, nfb.b());
            } catch (ngd e) {
                new fzi(fzrVar).a(8, e.getMessage());
                return;
            }
        }
        this.a.a(str, (byte[]) ftl.c(ftmVar), (byte[]) ftl.c(ftmVar2), new fzi(fzrVar), mzgVar);
    }

    @Override // defpackage.fzu
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        ftm ftkVar2;
        ftm ftkVar3;
        ftm ftkVar4;
        fzr fzpVar;
        fzr fzrVar = null;
        ftm ftkVar5 = null;
        if (i == 2) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                ftkVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                ftkVar2 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar2 = queryLocalInterface2 instanceof ftm ? (ftm) queryLocalInterface2 : new ftk(readStrongBinder2);
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                fzrVar = queryLocalInterface3 instanceof fzr ? (fzr) queryLocalInterface3 : new fzp(readStrongBinder3);
            }
            bkh.b(parcel);
            e(readString, ftkVar, ftkVar2, fzrVar);
            parcel2.writeNoException();
        } else if (i == 3) {
            parcel2.writeNoException();
            bkh.c(parcel2, true);
        } else if (i != 4) {
            return false;
        } else {
            String readString2 = parcel.readString();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 == null) {
                ftkVar3 = null;
            } else {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar3 = queryLocalInterface4 instanceof ftm ? (ftm) queryLocalInterface4 : new ftk(readStrongBinder4);
            }
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 == null) {
                ftkVar4 = null;
            } else {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar4 = queryLocalInterface5 instanceof ftm ? (ftm) queryLocalInterface5 : new ftk(readStrongBinder5);
            }
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 == null) {
                fzpVar = null;
            } else {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                fzpVar = queryLocalInterface6 instanceof fzr ? (fzr) queryLocalInterface6 : new fzp(readStrongBinder6);
            }
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 != null) {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar5 = queryLocalInterface7 instanceof ftm ? (ftm) queryLocalInterface7 : new ftk(readStrongBinder7);
            }
            ftm ftmVar = ftkVar5;
            bkh.b(parcel);
            f(readString2, ftkVar3, ftkVar4, fzpVar, ftmVar);
            parcel2.writeNoException();
        }
        return true;
    }

    public fzt() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }
}
