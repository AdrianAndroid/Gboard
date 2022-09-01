package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: ikj  reason: default package */
/* loaded from: classes.dex */
public final class ikj extends gyo implements ijj {
    private static volatile ikj c;
    private volatile boolean l = true;
    private final hst m;

    private ikj(Context context) {
        super(context);
        iki ikiVar = new iki(this);
        this.m = ikiVar;
        ijl.b().h(this, ikg.class, gyc.b);
        ikiVar.f(gyc.b);
    }

    public static ikj C(Context context) {
        ikj ikjVar = c;
        if (ikjVar == null) {
            synchronized (ikj.class) {
                ikjVar = c;
                if (ikjVar == null) {
                    ikjVar = new ikj(context.getApplicationContext());
                    ikjVar.q();
                    c = ikjVar;
                }
            }
        }
        return ikjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Object[] D(ika ikaVar, jav javVar, String[] strArr) {
        char c2;
        int length = strArr.length;
        Object[] objArr = new Object[4];
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i < 4) {
                String str = strArr[i];
                switch (str.hashCode()) {
                    case -1097462182:
                        if (str.equals("locale")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -342500282:
                        if (str.equals("shortcut")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -70023844:
                        if (str.equals("frequency")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3655434:
                        if (str.equals("word")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    objArr[i] = ikaVar.b;
                } else if (c2 == 1) {
                    objArr[i] = 255;
                } else if (c2 == 2) {
                    objArr[i] = javVar.q().toString();
                } else if (c2 == 3) {
                    objArr[i] = ikaVar.c;
                } else {
                    objArr[i] = null;
                }
                i++;
            } else {
                return objArr;
            }
        }
    }

    @Override // defpackage.gyo
    public final boolean B() {
        return this.l || ((gyo) this).b;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        ikg ikgVar = (ikg) ijgVar;
        this.l = true;
        A();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyo, defpackage.gyj
    public final synchronized void k(int i, int i2) {
        super.k(i, i2);
        if (i == 2) {
            this.l = false;
        }
    }

    @Override // defpackage.gyj
    public final gyi p(Context context, List list, gxe gxeVar) {
        gyi p = super.p(context, list, gxeVar);
        if (p.a.intValue() == 2) {
            String[] strArr = gyo.a;
            ikh ikhVar = new ikh();
            try {
                ikf c2 = ikhVar.c();
                llp b = hqr.b();
                while (c2.moveToNext()) {
                    ika b2 = c2.b();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        gyg gygVar = (gyg) it.next();
                        if (!jav.d.equals(b2.d)) {
                            lta listIterator = b.listIterator();
                            while (listIterator.hasNext()) {
                                hqt hqtVar = (hqt) listIterator.next();
                                jav javVar = b2.d;
                                jav i = hqtVar.i();
                                if (javVar == i || (Objects.equals(javVar.g, i.g) && Objects.equals(javVar.j, i.j))) {
                                    gygVar.d(D(b2, hqtVar.h(), strArr));
                                }
                            }
                        } else {
                            gygVar.d(D(b2, jav.d, strArr));
                        }
                    }
                }
                int count = c2.getCount();
                c2.close();
                ikhVar.close();
                return gyi.a(2, Integer.valueOf(p.b.intValue() + count));
            } catch (Throwable th) {
                try {
                    ikhVar.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        return p;
    }
}
