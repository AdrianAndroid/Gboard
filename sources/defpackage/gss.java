package defpackage;

import android.util.Property;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gss  reason: default package */
/* loaded from: classes.dex */
public final class gss extends Property {
    public gss(Class cls) {
        super(cls, "scaleBackground");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).findViewById(R.id.f51600_resource_name_obfuscated_res_0x7f0b0014).getScaleX());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        view.findViewById(R.id.f51600_resource_name_obfuscated_res_0x7f0b0014).setScaleX(f.floatValue());
        view.findViewById(R.id.f51600_resource_name_obfuscated_res_0x7f0b0014).setScaleY(f.floatValue());
    }
}
