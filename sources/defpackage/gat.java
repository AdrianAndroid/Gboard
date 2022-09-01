package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gat  reason: default package */
/* loaded from: classes.dex */
public abstract class gat extends bkg implements gau {
    public gat() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    public static gau asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
        return queryLocalInterface instanceof gau ? (gau) queryLocalInterface : new gas(iBinder);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        ftm ftkVar2;
        ftm ftkVar3;
        ftm ftkVar4;
        ftm ftkVar5;
        ftm ftkVar6;
        ftm ftkVar7;
        ftm ftkVar8;
        ftm ftkVar9;
        ftm ftkVar10;
        ftm ftkVar11;
        ftm ftkVar12;
        ftm ftkVar13;
        ftm ftkVar14;
        fpo fpoVar = null;
        switch (i) {
            case 3:
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface instanceof fpo ? (fpo) queryLocalInterface : new fpm(readStrongBinder);
                }
                bkh.b(parcel);
                start(readInt, fpoVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface2 instanceof fpo ? (fpo) queryLocalInterface2 : new fpm(readStrongBinder2);
                }
                bkh.b(parcel);
                stop(fpoVar);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    ftkVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar = queryLocalInterface3 instanceof ftm ? (ftm) queryLocalInterface3 : new ftk(readStrongBinder3);
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    ftkVar2 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar2 = queryLocalInterface4 instanceof ftm ? (ftm) queryLocalInterface4 : new ftk(readStrongBinder4);
                }
                fwm fwmVar = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface5 instanceof fpo ? (fpo) queryLocalInterface5 : new fpm(readStrongBinder5);
                }
                bkh.b(parcel);
                boolean initV26 = initV26(ftkVar, ftkVar2, fwmVar, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initV26);
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    ftkVar3 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar3 = queryLocalInterface6 instanceof ftm ? (ftm) queryLocalInterface6 : new ftk(readStrongBinder6);
                }
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    ftkVar4 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar4 = queryLocalInterface7 instanceof ftm ? (ftm) queryLocalInterface7 : new ftk(readStrongBinder7);
                }
                fwm fwmVar2 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface8 instanceof fpo ? (fpo) queryLocalInterface8 : new fpm(readStrongBinder8);
                }
                bkh.b(parcel);
                boolean initW24 = initW24(ftkVar3, ftkVar4, fwmVar2, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initW24);
                return true;
            case 8:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    ftkVar5 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar5 = queryLocalInterface9 instanceof ftm ? (ftm) queryLocalInterface9 : new ftk(readStrongBinder9);
                }
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    ftkVar6 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar6 = queryLocalInterface10 instanceof ftm ? (ftm) queryLocalInterface10 : new ftk(readStrongBinder10);
                }
                fwm fwmVar3 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface11 instanceof fpo ? (fpo) queryLocalInterface11 : new fpm(readStrongBinder11);
                }
                bkh.b(parcel);
                boolean initY2020W18 = initY2020W18(ftkVar5, ftkVar6, fwmVar3, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initY2020W18);
                return true;
            case 9:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 == null) {
                    ftkVar7 = null;
                } else {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar7 = queryLocalInterface12 instanceof ftm ? (ftm) queryLocalInterface12 : new ftk(readStrongBinder12);
                }
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 == null) {
                    ftkVar8 = null;
                } else {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar8 = queryLocalInterface13 instanceof ftm ? (ftm) queryLocalInterface13 : new ftk(readStrongBinder13);
                }
                fwm fwmVar4 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface14 instanceof fpo ? (fpo) queryLocalInterface14 : new fpm(readStrongBinder14);
                }
                bkh.b(parcel);
                boolean initY2020W30 = initY2020W30(ftkVar7, ftkVar8, fwmVar4, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initY2020W30);
                return true;
            case 10:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 == null) {
                    ftkVar9 = null;
                } else {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar9 = queryLocalInterface15 instanceof ftm ? (ftm) queryLocalInterface15 : new ftk(readStrongBinder15);
                }
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 == null) {
                    ftkVar10 = null;
                } else {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar10 = queryLocalInterface16 instanceof ftm ? (ftm) queryLocalInterface16 : new ftk(readStrongBinder16);
                }
                fwm fwmVar5 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface17 instanceof fpo ? (fpo) queryLocalInterface17 : new fpm(readStrongBinder17);
                }
                bkh.b(parcel);
                boolean initY2020W36 = initY2020W36(ftkVar9, ftkVar10, fwmVar5, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initY2020W36);
                return true;
            case 11:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 == null) {
                    ftkVar11 = null;
                } else {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar11 = queryLocalInterface18 instanceof ftm ? (ftm) queryLocalInterface18 : new ftk(readStrongBinder18);
                }
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 == null) {
                    ftkVar12 = null;
                } else {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar12 = queryLocalInterface19 instanceof ftm ? (ftm) queryLocalInterface19 : new ftk(readStrongBinder19);
                }
                fwm fwmVar6 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface20 instanceof fpo ? (fpo) queryLocalInterface20 : new fpm(readStrongBinder20);
                }
                bkh.b(parcel);
                boolean initY2021W30 = initY2021W30(ftkVar11, ftkVar12, fwmVar6, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initY2021W30);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 == null) {
                    ftkVar13 = null;
                } else {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar13 = queryLocalInterface21 instanceof ftm ? (ftm) queryLocalInterface21 : new ftk(readStrongBinder21);
                }
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 == null) {
                    ftkVar14 = null;
                } else {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar14 = queryLocalInterface22 instanceof ftm ? (ftm) queryLocalInterface22 : new ftk(readStrongBinder22);
                }
                fwm fwmVar7 = (fwm) bkh.a(parcel, fwm.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    fpoVar = queryLocalInterface23 instanceof fpo ? (fpo) queryLocalInterface23 : new fpm(readStrongBinder23);
                }
                bkh.b(parcel);
                boolean initY2022W24 = initY2022W24(ftkVar13, ftkVar14, fwmVar7, fpoVar);
                parcel2.writeNoException();
                bkh.c(parcel2, initY2022W24);
                return true;
        }
    }
}
