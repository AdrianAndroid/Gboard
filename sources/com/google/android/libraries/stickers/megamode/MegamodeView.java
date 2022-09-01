package com.google.android.libraries.stickers.megamode;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MegamodeView extends ConstraintLayout {
    public final Map c = new HashMap();
    public knk d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public ImageButton h;
    public Button i;
    public ImageButton j;
    public kod k;
    public koc l;
    public boolean m;
    private RecyclerView n;
    private fws o;

    public MegamodeView(Context context) {
        super(context);
    }

    public final void c(String str) {
        Context context = getContext();
        if (this.m) {
            this.h.setImageResource(R.drawable.f50770_resource_name_obfuscated_res_0x7f08037b);
            this.h.setColorFilter(us.a(context, R.color.f21830_resource_name_obfuscated_res_0x7f060122));
            this.h.setContentDescription(getContext().getString(R.string.f148720_resource_name_obfuscated_res_0x7f1400c7, str));
            return;
        }
        this.h.setImageResource(R.drawable.f50760_resource_name_obfuscated_res_0x7f08037a);
        this.h.setColorFilter(us.a(context, R.color.f21820_resource_name_obfuscated_res_0x7f060120));
        this.h.setContentDescription(getContext().getString(R.string.f148710_resource_name_obfuscated_res_0x7f1400c6, str));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fws fwsVar = new fws(this);
        this.o = fwsVar;
        ConnectivityManager a = fwsVar.a();
        if (a != null) {
            NetworkInfo activeNetworkInfo = a.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((kye) fwsVar.b).g();
            }
            a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) fwsVar.a);
        }
        ((knn) this.d).e.d(29);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ConnectivityManager a;
        super.onDetachedFromWindow();
        for (mko mkoVar : this.c.values()) {
            mkoVar.cancel(true);
        }
        fws fwsVar = this.o;
        if (fwsVar == null || (a = fwsVar.a()) == null) {
            return;
        }
        a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) fwsVar.a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (ImageView) findViewById(R.id.f66930_resource_name_obfuscated_res_0x7f0b0826);
        this.f = (TextView) findViewById(R.id.f66940_resource_name_obfuscated_res_0x7f0b0827);
        this.g = (TextView) findViewById(R.id.f66900_resource_name_obfuscated_res_0x7f0b0823);
        this.n = (RecyclerView) findViewById(R.id.f65770_resource_name_obfuscated_res_0x7f0b0799);
        this.i = (Button) findViewById(R.id.f53730_resource_name_obfuscated_res_0x7f0b0141);
        this.h = (ImageButton) findViewById(R.id.f55230_resource_name_obfuscated_res_0x7f0b01f4);
        this.j = (ImageButton) findViewById(R.id.f53810_resource_name_obfuscated_res_0x7f0b014e);
        getContext();
        this.n.ab(new GridLayoutManager(2, 0));
        koc kocVar = new koc();
        this.l = kocVar;
        this.n.aa(kocVar);
    }

    public MegamodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MegamodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
