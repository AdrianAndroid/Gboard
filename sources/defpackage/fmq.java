package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fmq  reason: default package */
/* loaded from: classes.dex */
public final class fmq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fmq(int i) {
        this.a = i;
    }

    public static void a(fqz fqzVar, Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, fqzVar.c);
        fyb.I(parcel, 2, fqzVar.d);
        fyb.I(parcel, 3, fqzVar.e);
        fyb.S(parcel, 4, fqzVar.f);
        fyb.N(parcel, 5, fqzVar.g);
        fyb.V(parcel, 6, fqzVar.h, i);
        fyb.K(parcel, 7, fqzVar.i);
        fyb.R(parcel, 8, fqzVar.j, i);
        fyb.V(parcel, 10, fqzVar.k, i);
        fyb.V(parcel, 11, fqzVar.l, i);
        fyb.F(parcel, 12, fqzVar.m);
        fyb.I(parcel, 13, fqzVar.n);
        fyb.F(parcel, 14, fqzVar.o);
        fyb.S(parcel, 15, fqzVar.p);
        fyb.E(parcel, C);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fmp[i];
            case 1:
                return new fmo[i];
            case 2:
                return new fmt[i];
            case 3:
                return new fmv[i];
            case 4:
                return new fnh[i];
            case 5:
                return new fni[i];
            case 6:
                return new fnj[i];
            case 7:
                return new Scope[i];
            case 8:
                return new Status[i];
            case 9:
                return new BitmapTeleporter[i];
            case 10:
                return new DataHolder[i];
            case 11:
                return new fqu[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fqv[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new fqz[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new fro[i];
            case 15:
                return new frq[i];
            case 16:
                return new frr[i];
            case 17:
                return new frt[i];
            case 18:
                return new fru[i];
            case 19:
                return new fsl[i];
            default:
                return new fst[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 578
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmq.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
