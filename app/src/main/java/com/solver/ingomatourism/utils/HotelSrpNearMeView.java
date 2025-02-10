package com.solver.ingomatourism.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.solver.ingomatourism.R;
import com.goibibo.hotel.srp.data.HeroPoiFd;
import com.goibibo.hotel.srp.data.HeroPoiFdO;
import com.goibibo.hotel.srp.data.HeroPoiObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HotelSrpNearMeView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    @NotNull
    public final l1g a;
    public boolean b;
    public boolean c;

    public HotelSrpNearMeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = (l1g) hr3.c(LayoutInflater.from(context), R.layout.lyt_hotel_srp_near_me, this, true, (gr3) null);
    }

    public final void a(@NotNull HeroPoiObject heroPoiObject, @NotNull Context context, boolean z) {
        HeroPoiFd a2 = heroPoiObject.a();
        ArrayList<HeroPoiFdO> arrayList = null;
        ArrayList<HeroPoiFdO> b2 = a2 != null ? a2.b() : null;
        l1g l1g = this.a;
        if (b2 == null || b2.isEmpty()) {
            this.b = false;
            l1g.v.setVisibility(8);
            l1g.y.setVisibility(8);
            return;
        }
        this.b = true;
        l1g.e.setVisibility(0);
        l1g.D.setText(heroPoiObject.b());
        l1g.C.setText(heroPoiObject.g());
        l1g.E.setText(heroPoiObject.f());
        l1g.A.setImageURI(heroPoiObject.c());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView = l1g.B;
        recyclerView.setLayoutManager(linearLayoutManager);
        HeroPoiFd a3 = heroPoiObject.a();
        if (a3 != null) {
            arrayList = a3.b();
        }
        recyclerView.setAdapter(new mfb(arrayList, context, kcc.NEAR_ME_POI));
        l1g.v.setOnClickListener(new uhk(this, 22));
        b();
        ConstraintLayout constraintLayout = l1g.y;
        if (z) {
            constraintLayout.setBackground(b83.getDrawable(context, R.drawable.white_round_rect_8dp));
        } else {
            constraintLayout.setBackground(b83.getDrawable(context, R.color.white));
        }
    }

    public final void b() {
        boolean z = this.b;
        l1g l1g = this.a;
        if (z) {
            l1g.v.setVisibility(8);
            l1g.y.setVisibility(0);
            this.c = true;
            return;
        }
        l1g.v.setVisibility(8);
        l1g.y.setVisibility(8);
        this.b = false;
    }

    @NotNull
    public final l1g getBinding() {
        return this.a;
    }

    public final void setExpanded(boolean z) {
        this.c = z;
    }

    public final void setNearMeAllowed(boolean z) {
        this.b = z;
    }

    public final void setUpSlotCollapsedState(@NotNull Pair<String, String> pair) {
        String str = (String) pair.b;
        l1g l1g = this.a;
        l1g.z.setText((String) pair.a);
        if (str == null || l4n.o(str)) {
            l1g.w.setVisibility(8);
            return;
        }
        l1g.w.setText(str);
        l1g.w.setVisibility(0);
        TextView textView = l1g.w;
        textView.setPaintFlags(8 | textView.getPaintFlags());
    }
}

