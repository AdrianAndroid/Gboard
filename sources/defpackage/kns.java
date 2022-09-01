package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kns  reason: default package */
/* loaded from: classes.dex */
public final class kns {
    public final Object a;
    public Object b;
    private final Object c;
    private final Object d;
    private final Object e;

    public kns(Context context, mlp mlpVar, flo floVar, fma fmaVar) {
        this.a = context;
        this.c = mlpVar;
        this.d = floVar;
        this.e = fmaVar;
    }

    public kns(jbd jbdVar, Parcelable.Creator creator) {
        this.c = new HashMap();
        this.e = new ArrayList();
        this.d = jbdVar;
        this.a = creator;
    }

    public static final boolean b(String str) {
        return str.contains("/stickers/");
    }

    public final void a(mlr mlrVar) {
        if (this.d == null) {
            return;
        }
        String d = lfd.d((String) this.b);
        gjb gjbVar = new gjb(1810762265, R.raw.f147380_resource_name_obfuscated_res_0x7f130052);
        Object obj = this.d;
        nfh t = mlq.c.t();
        Object obj2 = this.c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mlq) t.b).a = (mlp) obj2;
        nfh u = mlr.e.u(mlrVar);
        if (u.c) {
            u.cD();
            u.c = false;
        }
        ((mlr) u.b).b = d;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mlr mlrVar2 = (mlr) u.cz();
        mlrVar2.getClass();
        ((mlq) t.b).b = mlrVar2;
        flm c = ((flo) obj).c(t.cz());
        c.g = "EXPRESSION";
        c.j = gkd.a((Context) this.a, gjbVar);
        c.a();
    }

    public final void c(int i, String str, String str2) {
        String str3;
        if (this.e != null) {
            int parseInt = Integer.parseInt(str.substring(str.lastIndexOf(47) + 1));
            int parseInt2 = Integer.parseInt(str2.substring(str2.lastIndexOf(47) + 1));
            ldz ldzVar = ldz.e;
            ldz ldzVar2 = ldz.UPPER_CAMEL;
            switch (i) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str3 = "STICKER_SHARED";
                    break;
                case 15:
                default:
                    str3 = "CLICKED_PLAY_STORE";
                    break;
                case 16:
                    str3 = "PACK_DETAIL_OPENED";
                    break;
                case 17:
                    str3 = "CLIENT_PICKER_FAVORITES_OPENED";
                    break;
                case 18:
                    str3 = "OPEN_BROWSE";
                    break;
                case 19:
                    str3 = "OPEN_FAVORITES";
                    break;
                case 20:
                    str3 = "OPEN_SEARCH";
                    break;
                case 21:
                    str3 = "SEARCH_REQUEST_SENT";
                    break;
                case 22:
                    str3 = "SEARCH_REQUEST_SUCCESS";
                    break;
                case 23:
                    str3 = "SEARCH_REQUEST_ERROR";
                    break;
                case 24:
                    str3 = "OPEN_PACK_DETAIL";
                    break;
                case 25:
                    str3 = "STICKER_ATTACHED";
                    break;
                case 26:
                    str3 = "START_AVATAR_CREATION";
                    break;
                case 27:
                    str3 = "AVATAR_PROMO_BANNER_DISPLAYED";
                    break;
                case 28:
                    str3 = "MEGAMODE_BANNER_DISPLAYED";
                    break;
                case 29:
                    str3 = "MEGAMODE_OPENED";
                    break;
                case 30:
                    str3 = "OPEN_MEGAMODE";
                    break;
                case 31:
                    str3 = "OPEN_AVATAR_CUSTOMIZER";
                    break;
                case 32:
                    str3 = "SUGGEST_REQUEST_SENT";
                    break;
                case 33:
                    str3 = "SUGGEST_REQUEST_SUCCESS";
                    break;
                case 34:
                    str3 = "SUGGEST_REQUEST_ERROR";
                    break;
                case 35:
                    str3 = "STICKER_SELECT_OPENED";
                    break;
            }
            jdg.u(ldzVar2);
            if (ldzVar2 != ldzVar) {
                if (ldzVar2 == ldy.a) {
                    str3 = jdg.X(str3.replace('_', '-'));
                } else if (ldzVar2 == ldy.b) {
                    str3 = jdg.X(str3);
                } else {
                    StringBuilder sb = null;
                    int i2 = -1;
                    int i3 = 0;
                    while (true) {
                        i2 = ldzVar.f.d(str3, i2 + 1);
                        if (i2 != -1) {
                            if (i3 == 0) {
                                sb = new StringBuilder(str3.length() + (ldzVar2.g.length() * 4));
                                sb.append(ldzVar2.a(str3.substring(0, i2)));
                            } else {
                                ((StringBuilder) Objects.requireNonNull(sb)).append(ldzVar2.a(str3.substring(i3, i2)));
                            }
                            sb.append(ldzVar2.g);
                            i3 = ldzVar.g.length() + i2;
                        } else if (i3 == 0) {
                            str3 = ldzVar2.a(str3);
                        } else {
                            StringBuilder sb2 = (StringBuilder) Objects.requireNonNull(sb);
                            sb2.append(ldzVar2.a(str3.substring(i3)));
                            str3 = sb2.toString();
                        }
                    }
                }
            }
            nfh t = mlo.d.t();
            int x = kcu.x(((mlp) this.c).a);
            if (x == 0) {
                x = 1;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mlo) t.b).c = kcu.w(x);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mlo) t.b).a = 1;
            ((mlo) t.b).b = parseInt;
            ((fma) this.e).b(str3).b(parseInt2, new flv(((mlo) t.cz()).q()));
            ((fma) this.e).g();
        }
    }

    public final void d(int i) {
        nfh t = mlr.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mlr) t.b).a = kcu.u(i);
        a((mlr) t.cz());
    }

    public final Object e(Parcel parcel) {
        int readInt = parcel.readInt();
        Object obj = this.b;
        if (obj == null || readInt < 0) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (readInt >= objArr.length) {
            return null;
        }
        return objArr[readInt];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    public final void f(Parcel parcel) {
        this.b = kki.F(parcel, this.a);
    }

    public final void g(Parcel parcel, Object[] objArr) {
        if (objArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(objArr.length);
        for (Object obj : objArr) {
            h(parcel, obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void h(Parcel parcel, Object obj) {
        if (obj == null) {
            parcel.writeInt(-1);
            return;
        }
        Integer num = (Integer) this.c.get(obj);
        if (num == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jbd] */
    public final void i(Parcel parcel, int i) {
        ?? r0 = this.e;
        ?? r1 = this.d;
        parcel.writeInt(r0.size());
        for (Object obj : r0) {
            r1.a(parcel, obj, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    public final boolean j(Object obj) {
        if (obj == null || this.c.containsKey(obj)) {
            return false;
        }
        ?? r0 = this.c;
        r0.put(obj, Integer.valueOf(r0.size()));
        this.e.add(obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, android.os.Parcelable$Creator] */
    public final Object[] k(Parcel parcel) {
        int readInt;
        if (this.b == null || (readInt = parcel.readInt()) == -1) {
            return null;
        }
        Object[] newArray = this.a.newArray(readInt);
        for (int i = 0; i < readInt; i++) {
            Object e = e(parcel);
            if (e != null) {
                newArray[i] = e;
            }
        }
        return newArray;
    }
}
