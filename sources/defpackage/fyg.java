package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* renamed from: fyg  reason: default package */
/* loaded from: classes.dex */
public final class fyg extends bkg implements fyh {
    final /* synthetic */ InAppTrainingServiceImpl a;

    public fyg() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
    }

    @Override // defpackage.fyh
    public final void e() {
        InAppTrainingServiceImpl inAppTrainingServiceImpl = this.a;
        inAppTrainingServiceImpl.g.e(job.IN_APP_TRAINING_BACKGROUND_SERVICE_CANCELLED);
        inAppTrainingServiceImpl.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // defpackage.fyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, boolean r19, boolean r20, boolean r21, byte[] r22, defpackage.fyk r23) {
        /*
            r14 = this;
            r0 = r14
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r1 = r0.a
            fwe r1 = r1.i
            boolean r1 = r1.aL()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L37
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r1 = r0.a
            fwe r4 = r1.i
            java.lang.String r1 = r1.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "/"
            r5.append(r1)
            r1 = r15
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            r8 = r16
            java.lang.String r5 = defpackage.mhb.s(r5, r8)
            boolean r4 = r4.aj(r5)
            if (r4 == 0) goto L35
            goto L3a
        L35:
            r4 = 0
            goto L3b
        L37:
            r1 = r15
            r8 = r16
        L3a:
            r4 = 1
        L3b:
            joc r5 = defpackage.joc.f
            nfh r5 = r5.t()
            r3 = r3 ^ r4
            boolean r4 = r5.c
            if (r4 == 0) goto L4b
            r5.cD()
            r5.c = r2
        L4b:
            nfm r4 = r5.b
            joc r4 = (defpackage.joc) r4
            r4.b = r3
            nec r3 = defpackage.nec.c(r19)
            boolean r4 = r5.c
            if (r4 == 0) goto L5e
            r5.cD()
            r5.c = r2
        L5e:
            nfm r2 = r5.b
            joc r2 = (defpackage.joc) r2
            r3.getClass()
            r2.e = r3
            r3 = r20
            r2.c = r3
            r3 = r21
            r2.d = r3
            nfm r2 = r5.cz()
            r11 = r2
            joc r11 = (defpackage.joc) r11
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r6 = r0.a
            int r10 = defpackage.lvw.z(r18)
            r7 = r15
            r8 = r16
            r9 = r17
            r12 = r22
            r13 = r23
            r6.h(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyg.f(java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, byte[], fyk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // defpackage.fyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, byte[] r20, defpackage.fyk r21) {
        /*
            r13 = this;
            r0 = r13
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r1 = r0.a
            fwe r1 = r1.i
            boolean r1 = r1.aL()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L37
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r1 = r0.a
            fwe r4 = r1.i
            java.lang.String r1 = r1.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "/"
            r5.append(r1)
            r1 = r14
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = ""
            java.lang.String r5 = defpackage.mhb.s(r5, r6)
            boolean r4 = r4.aj(r5)
            if (r4 == 0) goto L35
            goto L38
        L35:
            r4 = 0
            goto L39
        L37:
            r1 = r14
        L38:
            r4 = 1
        L39:
            joc r5 = defpackage.joc.f
            nfh r5 = r5.t()
            r2 = r2 ^ r4
            boolean r4 = r5.c
            if (r4 == 0) goto L49
            r5.cD()
            r5.c = r3
        L49:
            nfm r4 = r5.b
            joc r4 = (defpackage.joc) r4
            r4.b = r2
            nec r2 = defpackage.nec.c(r18)
            boolean r4 = r5.c
            if (r4 == 0) goto L5c
            r5.cD()
            r5.c = r3
        L5c:
            nfm r4 = r5.b
            joc r4 = (defpackage.joc) r4
            r2.getClass()
            r4.e = r2
            r2 = r19
            r4.c = r2
            nfm r2 = r5.cz()
            r10 = r2
            joc r10 = (defpackage.joc) r10
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r6 = r0.a
            joa r2 = defpackage.joa.f
            nfh r2 = r2.t()
            boolean r4 = r2.c
            if (r4 == 0) goto L81
            r2.cD()
            r2.c = r3
        L81:
            nfm r3 = r2.b
            joa r3 = (defpackage.joa) r3
            r15.getClass()
            r4 = r15
            r3.a = r4
            r16.getClass()
            r4 = r16
            r3.e = r4
            r17.getClass()
            r4 = r17
            r3.c = r4
            nfm r2 = r2.cz()
            joa r2 = (defpackage.joa) r2
            fzf r8 = defpackage.fyb.c(r2)
            java.lang.String r9 = ""
            r7 = r14
            r11 = r20
            r12 = r21
            r6.d(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyg.g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, byte[], fyk):void");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fyk fykVar = null;
        if (i == 2) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            boolean g = bkh.g(parcel);
            boolean g2 = bkh.g(parcel);
            boolean g3 = bkh.g(parcel);
            byte[] createByteArray = parcel.createByteArray();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
                fykVar = queryLocalInterface instanceof fyk ? (fyk) queryLocalInterface : new fyi(readStrongBinder);
            }
            fyk fykVar2 = fykVar;
            bkh.b(parcel);
            f(readString, readString2, readString3, readInt, g, g2, g3, createByteArray, fykVar2);
            return true;
        } else if (i == 3) {
            e();
            return true;
        } else if (i != 5) {
            return false;
        } else {
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean g4 = bkh.g(parcel);
            boolean g5 = bkh.g(parcel);
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
                fykVar = queryLocalInterface2 instanceof fyk ? (fyk) queryLocalInterface2 : new fyi(readStrongBinder2);
            }
            fyk fykVar3 = fykVar;
            bkh.b(parcel);
            g(readString4, readString5, readString6, readString7, g4, g5, createByteArray2, fykVar3);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyg(InAppTrainingServiceImpl inAppTrainingServiceImpl) {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
        this.a = inAppTrainingServiceImpl;
    }
}
