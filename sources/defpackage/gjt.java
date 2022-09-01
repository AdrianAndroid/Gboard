package defpackage;

import android.os.HandlerThread;
import android.provider.Settings;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gjt  reason: default package */
/* loaded from: classes.dex */
public final class gjt implements gjr {
    public static final gjt a = new gjt();
    public final gjs[] b;

    private gjt() {
        int[] a2 = niv.a();
        int i = 0;
        for (int i2 = 0; i2 < 69; i2++) {
            int i3 = a2[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            i = Math.max(i, i4);
        }
        this.b = new gjs[i + 1];
        int[] a3 = niv.a();
        for (int i5 = 0; i5 < 69; i5++) {
            int i6 = a3[i5];
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 != 17 && i7 != 27) {
                    switch (i7) {
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case 15:
                            break;
                        default:
                            switch (i7) {
                                case 19:
                                case 20:
                                case 21:
                                    break;
                                default:
                                    switch (i7) {
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                            break;
                                        default:
                                            switch (i7) {
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                            break;
                                    }
                            }
                    }
                }
                gjs[] gjsVarArr = this.b;
                gjs gjsVar = new gjs();
                gjsVarArr[i7] = gjsVar;
                gjsVar.a = llp.q();
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.gjr
    public final gjq a(int i, gjd gjdVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return gjn.b;
            }
            ieq ieqVar = null;
            if (i2 == 2) {
                fpp fppVar = new fpp(gjdVar.a.getApplicationContext(), null);
                if (gjx.a == null) {
                    synchronized (gjx.b) {
                        if (gjx.a == null) {
                            gjx gjxVar = new gjx(gjdVar.a.getApplicationContext(), fppVar, null, null);
                            HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                            handlerThread.start();
                            gjxVar.c.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, new gjw(gjxVar, new gco(handlerThread.getLooper())));
                            gjx.a = gjxVar;
                        }
                    }
                }
                return gjx.a;
            } else if (i2 == 3) {
                return gjn.a;
            } else {
                if (i2 != 4 && i2 != 5 && i2 != 26) {
                    switch (i2) {
                        case 7:
                            return gjn.b;
                        case 8:
                            return gjn.b;
                        case 9:
                            return gjn.b;
                        case 10:
                            return gjn.b;
                        default:
                            switch (i2) {
                                case 22:
                                    return gjn.b;
                                case 23:
                                    return gjn.b;
                                case 24:
                                    return gjn.b;
                                default:
                                    gjs gjsVar = this.b[i2];
                                    if (gjsVar != null) {
                                        llp llpVar = gjsVar.a;
                                        if (((lrl) llpVar).c > 0) {
                                            gjp gjpVar = (gjp) llpVar.get(0);
                                            gjo gjoVar = gjpVar.a;
                                            ieqVar = gjpVar.b;
                                        }
                                    }
                                    return ieqVar != null ? ieqVar : gjn.a;
                            }
                    }
                }
                return gjn.b;
            }
        }
        return gjn.a;
    }
}
