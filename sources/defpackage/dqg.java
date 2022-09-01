package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dqg  reason: default package */
/* loaded from: classes.dex */
public final class dqg extends jct {
    private final IBinder a;
    private final int b;
    private final boolean c;
    private final llp d;
    private final mcp e;

    public dqg(Context context, IBinder iBinder, int i, boolean z, List list, mcp mcpVar) {
        super(context);
        this.a = iBinder;
        this.b = i;
        this.c = z;
        this.d = llp.o(list);
        this.e = mcpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jct, defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (this.c) {
            setContentView(R.layout.f143450_resource_name_obfuscated_res_0x7f0e0465);
        } else {
            setContentView(R.layout.f143440_resource_name_obfuscated_res_0x7f0e0464);
        }
        dqf dqfVar = new dqf(this.d);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f65820_resource_name_obfuscated_res_0x7f0b079e);
        recyclerView.getContext();
        recyclerView.ab(new LinearLayoutManager());
        recyclerView.aa(dqfVar);
        ((LinkableTextView) findViewById(R.id.f65830_resource_name_obfuscated_res_0x7f0b079f)).a = new bwd(this, 3);
        if (this.e.equals(mcp.JAPANESE_IME)) {
            findViewById(R.id.f65810_resource_name_obfuscated_res_0x7f0b079d).setVisibility(0);
        }
        findViewById(R.id.f65870_resource_name_obfuscated_res_0x7f0b07a3).setOnClickListener(new cjr(this, 16));
        Window window = getWindow();
        if (window != null) {
            double width = window.getWindowManager().getDefaultDisplay().getWidth();
            Double.isNaN(width);
            ((AppCompatTextView) findViewById(R.id.f65850_resource_name_obfuscated_res_0x7f0b07a1)).setMaxWidth((int) (width * 0.76d));
            gzm.n(window, this.a, this.b);
        }
    }
}
