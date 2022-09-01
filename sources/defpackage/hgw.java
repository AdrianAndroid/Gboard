package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hgw  reason: default package */
/* loaded from: classes.dex */
public final class hgw {
    public static final void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.getApplicationContext().unbindService(serviceConnection);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c;
        switch (str.hashCode()) {
            case -2011425818:
                if (str.equals("webref_consumer_good")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1814411494:
                if (str.equals("webref_event")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1232009037:
                if (str.equals("webref_organization")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1147692044:
                if (str.equals("address")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1034364087:
                if (str.equals("number")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -991716523:
                if (str.equals("person")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -686110273:
                if (str.equals("athlete")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -286998682:
                if (str.equals("consumer_good")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -112568619:
                if (str.equals("webref_person")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 96867:
                if (str.equals("art")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 116079:
                if (str.equals("url")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3076014:
                if (str.equals("date")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96891546:
                if (str.equals("event")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 302018275:
                if (str.equals("webref_art")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 653622069:
                if (str.equals("webref_location")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 843889169:
                if (str.equals("musician")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1178922291:
                if (str.equals("organization")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1793702779:
                if (str.equals("datetime")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 7;
            case 4:
                return 6;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 8;
            case '\b':
                return 9;
            case '\t':
                return 10;
            case '\n':
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "LOADING_SPINNER" : "EMPTY_CATEGORY_DESC" : "CATEGORY" : "IMAGE" : "EMOJI";
    }

    public static void d(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray2 == null || sparseArray2.size() <= 0) {
            return;
        }
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static void e(ArrayList arrayList, Object obj) {
        while (!arrayList.isEmpty()) {
            int size = arrayList.size() - 1;
            if (arrayList.get(size) != obj) {
                return;
            }
            arrayList.remove(size);
        }
    }

    public static boolean f(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static llw g(Context context, lfe lfeVar) {
        lls h = llw.h();
        llw b = gvf.b(context, gvm.class);
        lsz it = b.values().iterator();
        while (it.hasNext()) {
            gvm gvmVar = (gvm) it.next();
            if (lfeVar.a(gvmVar)) {
                h.a(gvmVar.a(), gvmVar.b());
            }
        }
        gvf.m(context, b.keySet());
        return h.l();
    }

    public static boolean h(boolean z, boolean z2) {
        return z || z2;
    }
}
