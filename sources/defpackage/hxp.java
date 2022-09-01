package defpackage;

import android.content.Context;
import android.util.Printer;
import android.util.SparseArray;
import android.view.inputmethod.EditorInfo;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hxp  reason: default package */
/* loaded from: classes.dex */
public final class hxp implements hxl {
    private final idk d;
    private final SparseArray e = new SparseArray();
    private long f;
    private long g;
    private long h;
    private int i;
    private ido j;
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/keythrottler/KeyThrottlerModule");
    static final hhl a = hhq.f("globe_key_ignore_time_interval_for_cjk", 0);
    static final hhl b = hhq.f("emoji_key_ignore_time_interval_for_cjk", 0);

    public hxp() {
        ieh j = ieh.j();
        this.d = j;
    }

    private final long f(int i) {
        hhl hhlVar = (hhl) this.e.get(i);
        if (hhlVar != null) {
            return ((Long) hhlVar.c()).longValue();
        }
        return 0L;
    }

    private final void g(hfd hfdVar) {
        if (hfdVar.h < this.h) {
            if (!hfdVar.e) {
                return;
            }
            this.i++;
            return;
        }
        ido idoVar = this.j;
        if (idoVar != null) {
            this.d.e(idoVar, Integer.valueOf(this.i));
        }
        this.j = null;
        this.i = 0;
    }

    private final void l() {
        this.f = 0L;
        this.i = 0;
        this.h = 0L;
        this.j = null;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        int i;
        iay[] iayVarArr;
        hxo hxoVar;
        if (hfdVar.d != 0 && (((i = hfdVar.p) == 1 || i == 2) && (iayVarArr = hfdVar.b) != null)) {
            long j = hfdVar.h;
            if (j > 0) {
                if (hfdVar.e) {
                    int i2 = iayVarArr[0].c;
                    long j2 = this.f;
                    if (j2 <= 0) {
                        long j3 = this.g;
                        if (j3 > 0) {
                            long j4 = j - j3;
                            if (i2 == -10058) {
                                this.d.g(hxr.EMOJI_TAPPED_SINCE_LAST_EMOJI_KEY, j4);
                            } else if (i2 == -10011) {
                                this.d.g(hxr.GLOBE_TAPPED_SINCE_LAST_GLOBE_KEY, j4);
                            }
                        }
                    } else {
                        long j5 = j - j2;
                        if (i2 == -10058) {
                            this.d.g(hxr.EMOJI_TAPPED_SINCE_LAST_NORMAL_KEY, j5);
                        } else if (i2 == -10011) {
                            this.d.g(hxr.GLOBE_TAPPED_SINCE_LAST_NORMAL_KEY, j5);
                        }
                        if (j5 < f(hfdVar.b[0].c)) {
                            this.f = 0L;
                            int i3 = hfdVar.b[0].c;
                            hxo hxoVar2 = null;
                            if (i3 != -10058) {
                                hxoVar = i3 != -10011 ? null : hxo.GLOBE_KEY_IGNORED;
                            } else {
                                hxoVar = hxo.EMOJI_KEY_IGNORED;
                            }
                            if (hxoVar != null) {
                                this.d.e(hxoVar, new Object[0]);
                            }
                            if (this.h <= 0) {
                                this.h = hfdVar.h + f(i3);
                                if (i3 == -10058) {
                                    hxoVar2 = hxo.EMOJI_KEY_TAPS_DURING_THROTTLING;
                                } else if (i3 == -10011) {
                                    hxoVar2 = hxo.GLOBE_KEY_TAPS_DURING_THROTTLING;
                                }
                                this.j = hxoVar2;
                            } else {
                                g(hfdVar);
                            }
                            ((ltd) ((ltd) c.b()).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrottlerModule", "consumeEvent", 123, "KeyThrottlerModule.java")).u("Ignore key: %s", i3);
                            return true;
                        }
                    }
                }
                g(hfdVar);
                if (hfdVar.e) {
                    this.f = 0L;
                    this.g = hfdVar.h;
                } else {
                    this.f = hfdVar.h;
                    this.g = 0L;
                }
            }
        }
        return false;
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new hxm(idiVar));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "KeyThrottlerModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.e.append(-10011, a);
        this.e.append(-10058, b);
        l();
    }

    @Override // defpackage.ifw
    public final void gn() {
        l();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
