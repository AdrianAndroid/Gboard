package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.apps.inputmethod.libs.languageselection.LanguageDraggableView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dna  reason: default package */
/* loaded from: classes.dex */
public final class dna extends LinearLayoutManager {
    private final abi a;
    private final abi b;
    private final abi c;
    private final abi d;
    private final abi e;
    private final dms f;

    public dna(Context context, dms dmsVar) {
        this.f = dmsVar;
        this.a = new abi((int) R.id.f51690_resource_name_obfuscated_res_0x7f0b001e, context.getString(R.string.f147830_resource_name_obfuscated_res_0x7f14002b));
        this.b = new abi((int) R.id.f51670_resource_name_obfuscated_res_0x7f0b001c, context.getString(R.string.f147810_resource_name_obfuscated_res_0x7f140029));
        this.c = new abi((int) R.id.f51680_resource_name_obfuscated_res_0x7f0b001d, context.getString(R.string.f147820_resource_name_obfuscated_res_0x7f14002a));
        this.d = new abi((int) R.id.f51660_resource_name_obfuscated_res_0x7f0b001b, context.getString(R.string.f147840_resource_name_obfuscated_res_0x7f14003a));
        this.e = new abi((int) R.id.f51700_resource_name_obfuscated_res_0x7f0b001f, context.getString(R.string.f164970_resource_name_obfuscated_res_0x7f140838));
    }

    @Override // defpackage.ly
    public final boolean bv(View view, int i) {
        int bo = bo(view);
        if (i == R.id.f51690_resource_name_obfuscated_res_0x7f0b001e) {
            return this.f.x(bo, bo - 1);
        }
        if (i == R.id.f51670_resource_name_obfuscated_res_0x7f0b001c) {
            return this.f.x(bo, bo + 1);
        }
        if (i == R.id.f51680_resource_name_obfuscated_res_0x7f0b001d) {
            return this.f.x(bo, 0);
        }
        if (i == R.id.f51660_resource_name_obfuscated_res_0x7f0b001b) {
            return this.f.x(bo, au() - 1);
        }
        if (i != R.id.f51700_resource_name_obfuscated_res_0x7f0b001f) {
            return false;
        }
        return this.f.y(bo);
    }

    @Override // defpackage.ly
    public final void r(me meVar, ml mlVar, View view, abj abjVar) {
        int au = au();
        int bo = bo(view);
        String valueOf = String.valueOf(((LanguageDraggableView) view).getContentDescription());
        StringBuilder sb = new StringBuilder();
        int i = bo + 1;
        sb.append(i);
        sb.append(", ");
        sb.append(valueOf);
        abjVar.b.setContentDescription(sb.toString());
        if (this.f.k) {
            return;
        }
        if (bo > 0) {
            abjVar.e(this.a);
            abjVar.e(this.c);
        }
        if (i < au) {
            abjVar.e(this.b);
            abjVar.e(this.d);
        }
        if (au <= 1) {
            return;
        }
        abjVar.e(this.e);
    }
}
