package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: icc  reason: default package */
/* loaded from: classes.dex */
public final class icc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public icc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new icd[i];
            case 1:
                return new ibm[i];
            case 2:
                return new jav[i];
            case 3:
                return new jed[i];
            case 4:
                return new jef[i];
            case 5:
                return new jen[i];
            case 6:
                return new jep[i];
            case 7:
                return new jet[i];
            case 8:
                return new jqj[i];
            case 9:
                return new jqm[i];
            case 10:
                return new jre[i];
            case 11:
                return new jrp[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new jsv[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new jtr[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new juc[i];
            case 15:
                return new jug[i];
            case 16:
                return new kmz[i];
            case 17:
                return new mnm[i];
            case 18:
                return new mnx[i];
            default:
                return new mnw[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = true;
        Uri uri = null;
        String str = null;
        switch (this.a) {
            case 0:
                return new icd(parcel);
            case 1:
                return new ibm(parcel);
            case 2:
                return jav.f(parcel.readString());
            case 3:
                return new jed(parcel);
            case 4:
                return new jef(null);
            case 5:
                return new jen(parcel);
            case 6:
                return new jep(parcel);
            case 7:
                return new jet(null);
            case 8:
                jqj jqjVar = jqj.d;
                Parcelable[] readParcelableArray = parcel.readParcelableArray(jug.class.getClassLoader());
                if (parcel.readInt() != 1) {
                    z = false;
                }
                byte[] createByteArray = parcel.createByteArray();
                jqi e = jqj.e();
                if (readParcelableArray != null) {
                    for (Parcelable parcelable : readParcelableArray) {
                        e.c((jug) parcelable);
                    }
                }
                e.d(z);
                e.e = createByteArray;
                return e.a();
            case 9:
                String d = lfd.d(parcel.readString());
                int readInt = parcel.readInt();
                Parcelable[] readParcelableArray2 = parcel.readParcelableArray(juc.class.getClassLoader());
                jql f = jqm.f();
                f.d(d);
                f.e(readInt);
                if (readParcelableArray2 != null) {
                    for (Parcelable parcelable2 : readParcelableArray2) {
                        f.b((juc) parcelable2);
                    }
                }
                return f.a();
            case 10:
                return jre.i(jre.j(parcel.readParcelableArray(juc.class.getClassLoader())), jre.j(parcel.readParcelableArray(juc.class.getClassLoader())), jre.j(parcel.readParcelableArray(juc.class.getClassLoader())), jre.j(parcel.readParcelableArray(juc.class.getClassLoader())), parcel.readInt() == 1, parcel.readInt() == 1, parcel.createByteArray());
            case 11:
                return jrp.d(parcel.readInt(), parcel.readInt());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                jsu j = jsv.j();
                j.a = readString;
                j.b = readString2;
                j.d(readInt2);
                j.c(readInt3);
                j.f(readInt4);
                j.b(readInt5);
                j.g(readInt6);
                if (createStringArrayList != null) {
                    int size = createStringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str2 = createStringArrayList.get(i);
                        jsi.f(str2);
                        if (j.c == null) {
                            if (j.d == null) {
                                j.c = llp.e();
                            } else {
                                j.c = llp.e();
                                j.c.j(j.d);
                                j.d = null;
                            }
                        }
                        j.c.h(str2);
                    }
                }
                return j.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return jtr.c(lfd.d(parcel.readString()), parcel.readInt());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                llp llpVar = juc.o;
                String d2 = lfd.d(parcel.readString());
                String readString3 = parcel.readString();
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                String readString4 = parcel.readString();
                long readLong3 = parcel.readLong();
                String readString5 = parcel.readString();
                jub p = juc.p();
                p.a = (jtr) parcel.readParcelable(jtr.class.getClassLoader());
                p.m(d2);
                p.l(lfd.d(readString3));
                p.n(readLong);
                p.h(readLong2);
                p.k(readInt7);
                p.i(readInt8);
                if (createStringArrayList2 != null) {
                    int size2 = createStringArrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        p.d(createStringArrayList2.get(i2));
                    }
                }
                if (createStringArrayList3 != null) {
                    p.g(createStringArrayList3);
                }
                p.c = readString4;
                p.j(new Date(readLong3));
                if (readString5 != null) {
                    p.e("label", readString5);
                }
                return p.a();
            case 15:
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                int readInt13 = parcel.readInt();
                juf g = jug.g();
                g.f((juc) parcel.readParcelable(juc.class.getClassLoader()));
                g.d(readInt9);
                g.c(readInt10);
                g.e(readInt11);
                g.b(readInt12);
                g.g(readInt13);
                return g.a();
            case 16:
                return new kmz(parcel);
            case 17:
                int ac = fyb.ac(parcel);
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                Uri uri2 = null;
                long j2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < ac) {
                    int readInt14 = parcel.readInt();
                    switch (fyb.Y(readInt14)) {
                        case 1:
                            str3 = fyb.ai(parcel, readInt14);
                            break;
                        case 2:
                            str4 = fyb.ai(parcel, readInt14);
                            break;
                        case 3:
                            i3 = fyb.aa(parcel, readInt14);
                            break;
                        case 4:
                            j2 = fyb.ad(parcel, readInt14);
                            break;
                        case 5:
                            bundle = fyb.ae(parcel, readInt14);
                            break;
                        case 6:
                            uri2 = (Uri) fyb.ag(parcel, readInt14, Uri.CREATOR);
                            break;
                        default:
                            fyb.ao(parcel, readInt14);
                            break;
                    }
                }
                fyb.am(parcel, ac);
                return new mnm(str3, str4, i3, j2, bundle, uri2);
            case 18:
                int ac2 = fyb.ac(parcel);
                Uri uri3 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < ac2) {
                    int readInt15 = parcel.readInt();
                    int Y = fyb.Y(readInt15);
                    if (Y == 1) {
                        uri = (Uri) fyb.ag(parcel, readInt15, Uri.CREATOR);
                    } else if (Y == 2) {
                        uri3 = (Uri) fyb.ag(parcel, readInt15, Uri.CREATOR);
                    } else if (Y == 3) {
                        arrayList = fyb.al(parcel, readInt15, mnw.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt15);
                    }
                }
                fyb.am(parcel, ac2);
                return new mnx(uri, uri3, arrayList);
            default:
                int ac3 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac3) {
                    int readInt16 = parcel.readInt();
                    if (fyb.Y(readInt16) == 2) {
                        str = fyb.ai(parcel, readInt16);
                    } else {
                        fyb.ao(parcel, readInt16);
                    }
                }
                fyb.am(parcel, ac3);
                return new mnw(str);
        }
    }
}
