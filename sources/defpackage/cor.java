package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Space;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cor  reason: default package */
/* loaded from: classes.dex */
public final class cor extends ls {
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/ElementAdapter");
    public final cpe d;
    public int e = -1;
    private final Locale g = hqp.e();
    private final cpf h;
    private final leq i;
    private final boolean j;

    public cor(cpe cpeVar, cpf cpfVar, leq leqVar, boolean z) {
        this.d = cpeVar;
        this.h = cpfVar;
        this.i = leqVar;
        this.j = z;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        cph cphVar;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            if (i == 2) {
                return new cpk(from.inflate(R.layout.f134420_resource_name_obfuscated_res_0x7f0e009b, viewGroup, false), this, this.g, false, this.j);
            }
            if (i == 3) {
                cphVar = new cph(from.inflate(R.layout.f134400_resource_name_obfuscated_res_0x7f0e0099, viewGroup, false), this);
            } else if (i == 4) {
                cphVar = new cph(from.inflate(R.layout.f134410_resource_name_obfuscated_res_0x7f0e009a, viewGroup, false), this);
            } else if (i == 5) {
                cphVar = new cph(from.inflate(R.layout.f134390_resource_name_obfuscated_res_0x7f0e0098, viewGroup, false), this);
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ElementAdapter", "onCreateViewHolder", 102, "ElementAdapter.java")).u("Unsupported view type received: %d", i);
                return new coy(new Space(viewGroup.getContext()), this);
            }
            return cphVar;
        }
        return new cpk(from.inflate(R.layout.f134430_resource_name_obfuscated_res_0x7f0e009c, viewGroup, false), this, this.g, true, this.j);
    }

    @Override // defpackage.ls
    public final int ha() {
        return ((lrl) this.h.b().b).c;
    }

    @Override // defpackage.ls
    public final int he(int i) {
        coq a = this.h.a(cox.b(i));
        if (a == null) {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ElementAdapter", "getItemViewType", 136, "ElementAdapter.java")).u("Failed to acquire element at position %d", i);
            return 0;
        } else if (a.a != col.IMAGE_RESOURCE) {
            col colVar = a.a;
            if (colVar == col.TEXT || colVar == col.TEXT_HINT_RESOURCE || colVar == col.TEXT_RESOURCE) {
                return (this.h.c().d == 4 || this.h.c().d == 5) ? 2 : 1;
            }
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ElementAdapter", "getItemViewType", 152, "ElementAdapter.java")).w("Failed to match element type %s to view type.", a.a);
            return 0;
        } else {
            com comVar = a.d;
            int i2 = comVar != null ? comVar.e : 2;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                return 4;
            }
            return i3 != 2 ? 3 : 5;
        }
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        coy coyVar = (coy) moVar;
        coq a = this.h.a(cox.b(i));
        if (a == null) {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ElementAdapter", "onBindViewHolder", 112, "ElementAdapter.java")).u("Tried to bind viewholder to position %d but no element found at that position", i);
        } else {
            coyVar.F(a);
        }
    }

    @Override // defpackage.ls
    public final /* synthetic */ void t(mo moVar) {
        ((coy) moVar).a.setOnClickListener(null);
    }

    public final boolean x(int i) {
        boolean z = false;
        if (i >= -1 && i < ha()) {
            int i2 = this.e;
            if (i2 == i) {
                return false;
            }
            this.e = i;
            if (i2 != -1) {
                Object a = this.i.a(Integer.valueOf(i2));
                if (a instanceof coy) {
                    ((coy) a).G(false);
                } else {
                    hg(i2);
                }
            }
            z = true;
            if (i != -1) {
                Object a2 = this.i.a(Integer.valueOf(i));
                if (a2 instanceof coy) {
                    ((coy) a2).G(true);
                    this.h.e(i);
                } else {
                    hg(i);
                }
            }
        }
        return z;
    }
}
